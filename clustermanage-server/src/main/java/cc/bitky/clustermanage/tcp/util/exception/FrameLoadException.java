package cc.bitky.clustermanage.tcp.util.exception;

/**
 * 数据帧读取异常抛出
 */
public class FrameLoadException extends Exception {
  public FrameLoadException(String msg) {
    super(msg);
  }
}