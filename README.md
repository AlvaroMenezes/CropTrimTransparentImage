# Crop / Trim Transparent Border 
Android "project to crop / trim transparent border of a bitmap.<br>
This code cut a squared image 
Easy and fast way to trim as images bellow <br>


<p align="center">
	BEFORE   -   AFTER
</p>
<p align="center">
  <img src="https://raw.githubusercontent.com/AlvaroMenezes/CropTrimTransparentImage/master/img/before.png" width="350"/>
  <img src="https://raw.githubusercontent.com/AlvaroMenezes/CropTrimTransparentImage/master/img/after.png" width="350"/>
</p>

##How to use

```java

	Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.your_img);
	CropTransparent ct = new CropTransparent();
	imageView.setImageBitmap(ct.crop(bmp));

```

##Developed By
ÁLVARO MENEZES - <alvaromenezes.inf@gmail.com>


##License
```

FREE! Use as you like ;)

``