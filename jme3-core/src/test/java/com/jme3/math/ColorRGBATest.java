package com.jme3.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorRGBATest {
	
	@Test
	public void testColors(){
		float red = ColorRGBA.Black.getRed();
		
		assertEquals(0f,red,0f);
		}
	
	@Test
	public void testColors1(){
		float green = ColorRGBA.Black.getGreen();
		
		assertEquals(0f,green,0f);
	}


	}


