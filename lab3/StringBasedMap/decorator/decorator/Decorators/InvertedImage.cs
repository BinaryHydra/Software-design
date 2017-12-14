using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PSP3.Decorators
{
    public class InvertedImage : ImageDecorator
    {
        public InvertedImage(string roleName, IDrawable drawable) : base(roleName, drawable)
        {
        }

        public override Bitmap getBitmap()
        {
            Bitmap bitmap = BaseDrawable.getBitmap();
            return InvertBitmap(bitmap);
        }

        private Bitmap InvertBitmap(Bitmap bitmap)
        {
            var bmap = (Bitmap)bitmap.Clone();
            for (int i = 0; i < bmap.Width; i++)
            {
                for (int j = 0; j < bmap.Height; j++)
                {
                    Color c = bmap.GetPixel(i, j);
                    bmap.SetPixel(i, j, Color.FromArgb(255 - c.R, 255 - c.G, 255 - c.B));
                }
            }
            return bmap;
        }
    }
}
