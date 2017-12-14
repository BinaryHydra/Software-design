using System.Drawing;
using System.Linq;

namespace PSP3
{
    public class Image: Drawable
    {
        private readonly Bitmap _bitmap;
        public int Width { get; private set; }
        public int Height { get; private set; }

        public Image(Bitmap bitmapVar) {
            _bitmap = bitmapVar;
            Height = bitmapVar.Height;
            Width = bitmapVar.Width;
        }

        public override Bitmap GetBitmap()
        {
            var tempBitmap = (Bitmap) _bitmap.Clone();
            Bitmap result = tempBitmap;
            foreach (var extention in Extentions)
                result = extention.Value.ModifyImage(result);
            return result;

        }
    }
}
