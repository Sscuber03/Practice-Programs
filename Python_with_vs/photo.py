from PIL import Image
from PIL import ImageEnhance

image = Image.open('gfg.png')

image.show()

curr_col = ImageEnhance.Color(image)
new_col = 0.0
image_bw = curr_col.enhance(new_col)
image_bw.show()
curr2_col = ImageEnhance.Color(image_bw)
new2_col = 2.5
image_col = curr2_col.enhance(new2_col)
image_col.show()
