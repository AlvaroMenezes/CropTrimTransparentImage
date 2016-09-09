# Crop / Trim Transparent Border <br>

Android code to crop/trim transparent border of a bitmap, returning a rectangle cropped image.<br><br>
Work fast in my tests. The results are like the images bellow <br>

<table style="width:100%">
	<tr>
    	<th>BEFORE</th>
    	<th>AFTER</th>
	</tr>
	<tr>
    	<td>
    		<img title="BEFORE"  src="https://raw.githubusercontent.com/AlvaroMenezes/CropTrimTransparentImage/master/img/before.png" width="350"/>
		</td>
    	<td>
    		<img title="AFTER"  src="https://raw.githubusercontent.com/AlvaroMenezes/CropTrimTransparentImage/master/img/after.png" width="350"/>
		</td>
	</tr>
</table>


##How to use

```java


	Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.your_img);
	CropTransparent ct = new CropTransparent();
	imageView.setImageBitmap(ct.crop(bmp));
	

```
Easy to use, just add this [class](/Project/app/src/main/java/alvaromenezes/com/trimimage/CropTransparent.java) into your project and go ahead.

##Developed By
Álvaro Menezes - <alvaromenezes.inf@gmail.com>

##License
```
FREE! Use as you like ;)
```