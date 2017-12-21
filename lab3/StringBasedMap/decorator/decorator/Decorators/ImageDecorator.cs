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
        protected string RoleName;

        protected ImageDecorator(string roleName, IDrawable drawable)
        {
            BaseDrawable = drawable;
            RoleName = roleName;
        }

        public int Width => BaseDrawable.Width;
        public int Height => BaseDrawable.Height;

        public virtual Bitmap GetBitmap()
        {
            return BaseDrawable.GetBitmap();
        }



        public ImageDecorator GetRole(string roleNameVar)
        {
            if (RoleName.Equals(roleNameVar))
            {
                return this;
            }
            if (BaseDrawable is ImageDecorator)
            {
                return ((ImageDecorator) BaseDrawable).GetRole(roleNameVar);
            }
            return null;
        }

        public IDrawable RemoveRole(string roleNameVar)
        {
            if (RoleName == roleNameVar)
            {
                //removing this
                return BaseDrawable;
            }
            var decorator = BaseDrawable as ImageDecorator;
            if (decorator != null)
            {
                //removing decorator in the middle
                if (decorator.RoleName == roleNameVar)
                {
                    BaseDrawable = decorator.BaseDrawable;
                    return this;
                }
                decorator.RemoveRole(roleNameVar);
            }
            return this;
        }

        public IDrawable GetBaseDrawable()
        {
            var drawable = BaseDrawable as ImageDecorator;
            if (drawable != null)
            {
                return drawable.GetBaseDrawable();
            }
            return BaseDrawable;
        }
    }
}
