The key is how to build a handler chain.

The Handler class defined as abstract class, so it can have a concrete field: successor

If you can't resolve the request, pass to your successor. 

Director, VP and CEO implements Handler method, so it can override the handleRequest method, 
to decide if handle here or pass to the successor.