using System;
using System.Drawing;
using PSP3;

namespace PSI_extention.extections
{
    public abstract class ImageExtention
    {
        private Drawable _baseDrawable;

        protected ImageExtention(Drawable decoratable)
        {
            _baseDrawable = decoratable;
        }
        public abstract Bitmap ModifyImage(Bitmap bitmap);
    }
}
