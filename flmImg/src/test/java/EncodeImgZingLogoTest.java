import java.io.File;
import java.io.IOException;

/**
 * EncodeImgZingLogoTest
 * Created by user on2018/11/13
 */
public class EncodeImgZingLogoTest {
    public static void main(String[] args) throws IOException {
        String contents = "https://user.qzone.qq.com";
        String format = "jpg";
        //生成二维码
        File img = new File("D:"+ File.separator+"csdn.jpg");
        EncodeImgZxing.writeToFile(contents, format, img);
//      //添加logo图片
        File logoImg = new File("D:/pic"+File.separator+"logo4.jpg");
        File img1 = new File("D:"+File.separator+"csdnAndLogo.jpg");
        EncodeImgZingLogo.writeToFile(img, logoImg, format, img1);

        //解析二维码
        String content = DecodeImgZxing.decodeImg(img);
        System.out.println("1:"+content);
        //带logo
        String content1 = DecodeImgZxing.decodeImg(img1);
        System.out.println("2:"+content1);
    }
}
