/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "MultiScroll"
 * MultiScroll.java �u����GIF�𗘗p���āA�w�i�𑽏d�X�N���[���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java MultiScroll
 * �y�L�[���[�h�z
 *     �t���[�����[�g(frame rate)
 * �y�����Ă݂悤�z
 *     GIF�摜�̓����������m�F����B *     �e�w�i�̃X�N���[���X�s�[�h��ς��Ă݂�B *     �Ԃ�O�ɐi�߂���A�����݂ɏ㉺�ɓ��������肷��B
 */
import java.lang.String;
import javax.swing.JFrame;
import javax.swing.Timer;

public class MultiScroll extends JFrame {

    final static int C00 = 33;    // �P�b������̕`���

    public MultiScroll() {
        DrawPanel L00 = new DrawPanel();
        setContentPane(L00);

        new Timer(1000 / C00, L00).start();
    }

    public static void main(String[] A00) {
        MultiScroll L00 = new MultiScroll();
        L00.setTitle("�w�i�̑��d�X�N���[��");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setResizable(false);
        L00.pack();
        L00.setVisible(true);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�w�i�𑽏d�X�N���[��������T���v���ł��BMultiScroll�ADrawPanel�A
Background��3�̃N���X����\������Ă��܂��B

����MultiScroll�N���X��main���\�b�h���������G���g���[�ŁA�t���[���A�`��
�p�l���A�^�C�}�[�̐������s���Ă܂��BDrawPanel�N���X�͕`��p�̃p�l���B�^
�C�}�[�C�x���g�͂��̃p�l���ɒʒm����܂��BBackground�N���X�́A1���̔w�i
���Ǘ�����N���X�B�w�i�̖������A���̃N���X�̃C���X�^���X����������܂��B

���Ȃ݂ɁA�Ԃ�Fiat500�i�`���N�`�F���g�j�B�w�J���I�X�g���̏�x�Ń��p���O
��������Ă�����ł��ˁB
 */
