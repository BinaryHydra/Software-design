using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PSP3
{
    public abstract class ImageDecorator : IDrawable
    {
        protected IDrawable BaseDrawable { get; set; }

        protected ImageDecorator(IDrawable drawable)
        {
            BaseDrawable = drawable;
        } 

        public virtual Bitmap getBitmap()
        {
            return BaseDrawable.getBitmap();
        }

        public T GetRole<T>() where T : ImageDecorator
        {
            if (this is T)
            {
                return (T) this;
            }
            if (BaseDrawable is ImageDecorator)
            {
                return ((ImageDecorator) BaseDrawable).GetRole<T>();
            }
            return null;
         }

        public IDrawable RemoveRole<T>() where T : ImageDecorator
        {
            if (this is T)
            {
                return BaseDrawable;
            }
            if (BaseDrawable is T)
            {
                BaseDrawable = ((ImageDecorator) BaseDrawable).BaseDrawable;
                return this;
            }
            var drawable = BaseDrawable as ImageDecorator;
            if (drawable == null)
            { 
                return this;
            }
            drawable.RemoveRole<T>();
            return this;
        }
    }
}
