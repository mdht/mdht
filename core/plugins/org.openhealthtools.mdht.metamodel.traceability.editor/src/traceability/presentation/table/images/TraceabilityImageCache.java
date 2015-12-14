/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package traceability.presentation.table.images;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

/**
 * Retrieves and caches images stored in this folder, scaling each image to not exceed the 32x32 boundaries
 */
public class TraceabilityImageCache {

	static private Map<String, Image> imageCache = new HashMap<String, Image>();

	public static Image getImage(String imageName) {
		if (!imageCache.containsKey(imageName)) {
			Image imgInput = null;
			try {
				URL url = new URL(imageName);
				ImageDescriptor desc = ImageDescriptor.createFromURL(url);
				imgInput = desc.createImage(false);
			} catch (MalformedURLException e) {
				// hit and run
			}
			if (imgInput == null) {
				imageCache.put(imageName, null);
				return null;
			}
			imgInput = scaleImage(imgInput);
			imageCache.put(imageName, imgInput);
		}
		return imageCache.get(imageName);
	}

	/**
	 * @param imgInput
	 * @return
	 */
	private static Image scaleImage(Image imgInput) {
		float scale = 1.0f;
		ImageData data = imgInput.getImageData();
		int width = 32;
		int height = 32;
		if (width < data.width) {
			scale = width / (float) data.width;
		}
		if (height < data.height) {
			float tmpScale = height / (float) data.height;
			scale = scale < tmpScale ? scale : tmpScale;
		}
		if (scale > 0.0 && scale != 1) {
			int newWidth = Math.round(data.width * scale);
			int newHeight = Math.round(data.height * scale);
			Image scaledImage = new Image(Display.getCurrent(), width, height);
			GC gcImage = new GC(scaledImage);
			gcImage.setAntialias(SWT.ON);
			gcImage.setAdvanced(true);
			gcImage.setInterpolation(SWT.HIGH);
			gcImage.drawImage(imgInput, 0, 0, data.width, data.height, (width - newWidth) / 2, (height - newHeight) / 2, newWidth, newHeight);
			imgInput.dispose();
			imgInput = scaledImage;
		}
		return imgInput;
	}
}
