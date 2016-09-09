package alvaromenezes.com.trimimage;

import android.graphics.Bitmap;

import java.util.Arrays;

/**
 * Created by Álvaro Menezes on 9/9/16.
 */
public class CropTransparent {

    /***
     * Trim an image, removing transparent borders.
     * @param bitmap image to crop
     * @return square bitmap with the cropped image
     */
    public Bitmap crop (Bitmap bitmap){

        int height = bitmap.getHeight();
        int width = bitmap.getWidth();

        int[] empty = new int[width];
        int[] buffer = new int[width];
        Arrays.fill(empty,0);

        int top = 0;
        int left = 0;
        int botton = height;
        int right = width;

        for (int y = 0; y < height; y++) {
            bitmap.getPixels(buffer, 0, width, 0, y, width, 1);
            if (!Arrays.equals(empty, buffer)) {
                top = y;
                break;
            }
        }

        for (int y = height - 1; y > top; y--) {
            bitmap.getPixels(buffer, 0, width, 0, y, width, 1);
            if (!Arrays.equals(empty, buffer)) {
                botton = y;
                break;
            }
        }


        int bufferSize = botton -top +1;
        empty = new int[bufferSize];
        buffer = new int[bufferSize];
        Arrays.fill(empty,0);

        for (int x = 0; x < width; x++) {
            bitmap.getPixels(buffer, 0, 1, x, top + 1, 1, bufferSize);
            if (!Arrays.equals(empty, buffer)) {
                left = x;
                break;
            }
        }

        Arrays.fill(empty, 0);
        for (int x = width - 1; x > left; x--) {
            bitmap.getPixels(buffer, 0, 1, x, top + 1, 1, bufferSize);
            if (!Arrays.equals(empty, buffer)) {
                right = x;
                break;
            }
        }

        Bitmap cropedBitmap = Bitmap.createBitmap(bitmap, left, top, right-left, botton-top);
        return cropedBitmap;
    }

}
