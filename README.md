java-eps-graphics
=================

Java EPS Graphics2D Library

Features:

 - familiar Graphics2D interface
 - automatic bounds detection

Example usage:

    EPSGraphics2D graphics = new EPSGraphics2D();
    graphics.drawString("Hello World!", 0, 0);
    graphics.writeToFile(new File("helloworld.eps"));


Code license: [LGPLv3](http://www.gnu.org/copyleft/lesser.html)