using System;
using System.Drawing;
using PSP3;

namespace PSI_extention.extections
{
    public abstract class ImageExtention
    {
        protected ImageComponent BaseImageComponent;

        protected ImageExtention(ImageComponent extendable)
        {
            BaseImageComponent = extendable;
        }
        public abstract Bitmap ModifyImage(Bitmap bitmap);
    }
}
