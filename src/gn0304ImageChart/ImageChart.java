/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "ImageChart"
 * ImageChart.java �uJLabel��HTML�\���@�\�Ŗ_�O���t���ȒP�ɕ\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac ImageChart.java
 *     >java ImageChart
 * �y�L�[���[�h�z
 *     HTML(HyperText Markup Language), table�^�O, img�^�O,  *     URL(Uniform Resource Locator)
 * �y�����Ă݂悤�z
 *     JLabel�̓��e��System.out.println�ŕ\�����āA�摜�t�@�C����URL���m�F����B *     table�^�O��border�����ŕ\�ɘg������B *     ���ڂ��Ƃ̐��l���\������B
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.lang.String;
import java.lang.StringBuffer;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageChart extends JFrame {

    public ImageChart() {
        Item[] L00 = {
            new Item("�`��", "image/bar01.gif", 48),
            new Item("�a��", "image/bar02.gif", 159),
            new Item("�b��", "image/bar03.gif", 106),
            new Item("�c��", "image/bar04.gif", 89), 
        };

        StringBuffer L01 = new StringBuffer();

        L01.append("<html><table cellpadding='4' cellspacing='4'>");
        for (Item L02 : L00) {
            L01.append(String.format("<tr><td>%s</td><td>%s</td></tr>", L02.M00(), L02.M01()));
        }
        L01.append("</table></html>");

        add(new JLabel(L01.toString()), BorderLayout.CENTER);
    }

    public static void main(String[] A00) {
        JFrame L00 = new ImageChart();
        L00.setTitle("�摜���g�����O���t");
        L00.getContentPane().setBackground(Color.white);
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.pack();
        L00.setResizable(false);
        L00.setVisible(true);
    }
}

class Item {
    private String I00;
    private String I01;
    private int I02;

    Item(String A00, String A01, int A02) {
        this.I00 = A00;
        this.I01 = A01;
        this.I02 = A02;
    }

    public String M00() {
        return I00;
    }

    public String M01() {
        String L00 = "";
        try {
            URL L01 = new File(I01).toURL();
            L00 = String.format("<img src='%s' width='%d'>", L01, I02);
        } catch (MalformedURLException e) {
            System.out.println("�摜�t�@�C���̎w��Ɍ�肪����܂��B");
        }

        return L00;
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Swing�ŉ摜�\���Ƃ����ƁAJPanel�ɒ��ڕ`�悷��̂��v�������ׂ邩�������
���񂪁AJLabel��HTML�ŕ\������Ƃ����A�v���[�`������܂��B����́A�摜��
�����݂̂ō\�������O���t�ł��̂ŁAHTML��table�^�O�𗘗p���āAJLabel��
���C�A�E�g���邱�Ƃɂ��܂����B

�_�O���t�̌��摜�́A�ǂ̐F����8�h�b�g�B�����img�^�O��width�����ɒl���
�肷�邱�ƂŁA���̒�����ς��Ă��܂��BWeb�A�v���P�[�V�����ł悭�g����@
�ł��ˁB

img�^�O�Ƀ��[�J���̃t�@�C�������w�肷��ꍇ�́AURL�ɕϊ�����K�v�������
���B<img src="image/fish00.gif">�̂悤�ɑ��΃p�X�Ŏw�肵�Ă��\������܂�
��̂Œ��ӂ��Ă��������B���΃p�X��URL�̕ϊ��́Ajava.io.File�I�u�W�F�N�g
������āAtoURL���\�b�h���Ăׂ�OK�B

JLabel�ɐݒ肷��HTML�^�O�̘A���ɂ́AStringBuffer���g���Ă܂��BString��+
�ŘA������̂ɔ�ׁA�������ɖ��ʂ�����܂���B�u������p�ɂɘA������Ƃ�
��StringBuffer�v�Ɗo���Ă����Ă��������B
 */
