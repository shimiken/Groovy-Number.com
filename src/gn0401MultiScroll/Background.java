/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "MultiScroll"
 * Background.java �u����GIF�𗘗p���āA�w�i�𑽏d�X�N���[���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java MultiScroll
 * �y�L�[���[�h�z
 *     �A�N�Z�T���\�b�h(accessor method), 
 * �y�����Ă݂悤�z
 *     MultiScroll.java�Q�ƁB
 */
import java.awt.Image;
import java.lang.String;
import javax.swing.ImageIcon;

public class Background {
    private Image I00;  // �摜
    private int I01;    // ��
    private int I02;    // �\���ʒu
    private int I03;    // �ړ����x

    public Background(String A00, int A01) {
        I00 = new ImageIcon(A00).getImage();
        I01 = I00.getWidth(null);
        I02 = 0;
        this.I03 = A01;
    }
    
    public Image M00() {
        return I00;
    }
    
    public int M01() {
        return I01;
    }

    public int M02() {
        return I02;
    }
   
    public void M03() {
        if (I00 != null) {
            I02 = (I02 + I03) % I01;
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�w�i�摜���Ǘ�����N���X�ł��B�t�B�[���h�ϐ��i�v���p�e�B�j���悭���Ă���
�����B���ꂪ�ꖇ�̔w�i�ɕK�v�ȏ��ł��B

�R���X�g���N�^�[�ōs���Ă���̂��A���̃t�B�[���h�̏������B�����œn���ꂽ
����Œ�̐��l���g���āA�t�B�[���h�ϐ��ɏ����l�������Ă��܂��B

�P���Ƀt�B�[���h�ϐ��̒l��Ԃ������̃��\�b�h������������܂����A�����
�ɂ́Aget�`()�Ƃ������O������̂���ʓI�B���Ƃ��΁Aprivate String name
�Ƃ���΁Apublic String getName()�Ăȋ�ł��ˁB����̃T���v���ɂ͂���
�܂��񂪁A�t�B�[���h�ɒl��ݒ肷�郁�\�b�h�Ȃ�Aset�`()�ƂȂ�܂��B

���Ȃ݂ɁA�����Ń��\�b�h����ς�����A�Ăяo������DrawPanel.java��������
���ɕύX���Ă��������ˁB
 */
