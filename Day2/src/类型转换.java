public class 类型转换
{
   public static void main(String[] args)
   {
      //byte short char 的运算均转为int
      // int
      // long float double
      //强制转换 可能导致 精度损失
      int i3 = 128;
      byte b = (byte) i3; //-128

      double d1 = 12.9;
      i3 = (int) d1;

      System.out.println(i3);
      byte b1 = 2;
      int i1 = 12;
      byte b2 = (byte) (b1 + i1);

      float f = 1.0f;
      long l = 1111l;
      f = l;
      l = (long) f;

      short s2 = 10;
      char c = 'c';
      char c2 = 87;
      char c3 = '5'; //53
      int i4 = c3;
      int i2 = c + s2;
      //short s3 = 2 * s2;

      System.out.println(i4);
   }
}
