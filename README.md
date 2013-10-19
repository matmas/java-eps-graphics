java-eps-graphics
=================

Java EPS Graphics2D Library

Features:

 - familiar Graphics2D interface
 - automatic bounds detection

Example usage:

    Graphics2D g = new EPSGraphics2D();
    g.drawString("Hello World!", 0, 0);
    ((EPSGraphics2D) g).writeToFile(new File("helloworld.eps"));


Code license: BSD
