using System;
using System.Drawing;
using PSI_extention.Extentions;
using PSP3;

namespace PSI_extention.extections
{
    public interface ImageExtention: IExtention {

        Bitmap ModifyImage(Bitmap bitmap);
    }
}
