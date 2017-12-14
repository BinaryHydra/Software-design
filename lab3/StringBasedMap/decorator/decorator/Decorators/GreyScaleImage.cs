using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PSP3
{
    public class GreyScaleImage : ImageDecorator
    {

        public GreyScaleImage(string roleName,IDrawable image) : base (roleName, image)
        {
        }

        public override Bitmap getBitmap()
        {
           Bitmap bitmap = BaseDrawable.getBitmap();
           return GreyScale(bitmap);
        }

        private Bitmap GreyScale(Bitmap bitmap)
        {
            var tempBitmap = (Bitmap)bitmap.Clone();
            for (var i = 0; i < tempBitmap.Width; i++)
            {
                for (var j = 0; j < tempBitmap.Height; j++)
                {
                    Color c = tempBitmap.GetPixel(i, j);
                    var gray = (byte)(.299 * c.R + .587 * c.G + .114 * c.B);

                    tempBitmap.SetPixel(i, j, Color.FromArgb(gray, gray, gray));
                }
            }
            return tempBitmap;
        } 
    }
}
