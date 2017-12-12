using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Drawing;

namespace PSP3
{
    public class Image: IDrawable
    {
        private readonly Bitmap _bitmap;
        public int Width { get; private set; }
        public int Height { get; private set; }

        public Image(Bitmap bitmapVar) {
            _bitmap = bitmapVar;
            Height = bitmapVar.Height;
            Width = bitmapVar.Width;
        }

        public Bitmap getBitmap()
        {
            return _bitmap;
        }


    }
}
