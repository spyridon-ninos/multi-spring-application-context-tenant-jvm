## Introduction
This is a simple experiment, to see when we run many spring
application (web) contexts under the same jvm, how the failures
of one context affects the others.

## Description
We define 3 web application contexts, each with its own
container (because we wanted to define different ports
and using the server.port did not allow for this).

The first context is a fully functioning one. Once
it's initialised, you can hit the **localhost:2000** url and see
the famous **"hello world"** as a text response.

The second context has an unsatisfied dependency. The
dependency breaks at runtime, so the context essentially
fails to initialise. If it initialised you could hit the
**localhost:3000** url and get a (not) famous **"hello greece"**
as a text response.

The third context initialises as expected, but after you hit
the **localhost:4000** url, an OutOfMemoryError is thrown (a second
later) with the intend to kill the context. The response **"hello
athens"** should never return as a result.

The third context writes some logs (at the console).

## Observations
It seems that the contexts are completely independent.

If a failure happens in one, the others seem to keep working
unaffected.

I could not make the third context die by throwing the memory error
(also tried throwing a RuntimeException), so after the error is thrown,
you can hit again the respective url and see the logs that it serves
again the request.

When the second context fails to initialise, due to the
unsatisfied dependency, the main method returns. This is the reason
I put it last in the code.

## Conclusions
Unless there is a condition that actually kills the jvm,
once the contexts are initialised they keep working
without being affected by errors from the other contexts.

We should note that the contexts are not hierarchical, like we see
with the parent and children contexts that spring allows us
to have (e.g. parent + web), but completely different ones.


