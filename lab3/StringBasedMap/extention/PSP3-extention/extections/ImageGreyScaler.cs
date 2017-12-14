using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PSI_extention.extections
{
    public class ImageGreyScaler : IImageExtention
    {
        public Bitmap ModifyImage(Bitmap bitmap)
        {  
            for (var i = 0; i < bitmap.Width; i++)
            {
                for (var j = 0; j < bitmap.Height; j++)
                {
                    Color c = bitmap.GetPixel(i, j);
                    var gray = (byte)(.299 * c.R + .587 * c.G + .114 * c.B);
                    bitmap.SetPixel(i, j, Color.FromArgb(gray, gray, gray));
                }
            }
            return bitmap;
        }
    }
}
