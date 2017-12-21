using System.Drawing;
using System.Linq;
using PSI_extention;
using PSI_extention.extections;

namespace PSP3
{
    public class Image: AbstractExtendableComponent, IDrawable
    {
        private readonly Bitmap _bitmap;
        public int Width { get; }
        public int Height { get; }

        public Image(Bitmap bitmapVar) {
            _bitmap = bitmapVar;
            Height = bitmapVar.Height;
            Width = bitmapVar.Width;
        }

        public Bitmap GetBitmap()
        {
            var tempBitmap = (Bitmap) _bitmap.Clone();
            Bitmap result = tempBitmap;
            foreach (var extention in Extentions)
                result = ((ImageExtention)extention.Value).ModifyImage(result);
            return result;

        }
    }
}
