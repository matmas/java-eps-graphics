/*
 * Copyright (C) 2008-2012 Martin Riesz <riesz.martin at gmail.com>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either 
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public 
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.matmas.epsgraphics;

import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Martin Riesz <riesz.martin at gmail.com>
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Graphics2D g = new EPSGraphics2D();
        g.drawString("Hello World!", 0, 0);
        
        ((EPSGraphics2D)g).writeToFile(new File("helloworld.eps"));
    }
}
