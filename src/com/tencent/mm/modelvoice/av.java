package com.tencent.mm.modelvoice;

import android.os.Message;
import com.tencent.mm.compatible.audio.e;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class av extends cm
{
  av(at paramat)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "dkbt Recorder handleMessage");
    if (at.j(this.dHS))
      return;
    bg.qY().b(this.dHS);
    bg.qY().mr();
    this.dHS.bY(200);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.av
 * JD-Core Version:    0.6.2
 */