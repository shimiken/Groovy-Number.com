/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "BallReflection"
 * BallReflection.java �u�E�B���h�E�̓����𔽎˂���{�[���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java BallReflection
 * �y�L�[���[�h�z
 *     ��ʂ̃��t���b�V�����[�g(refresh rate:�����������g��)
 * �y�����Ă݂悤�z
 *     �^�C�}�[�̔����Ԋu��ς��āA�A�j���[�V�����̌��������ׂ�B *     �E�B���h�E�̃T�C�Y��ύX�\�ɂ��A�t���[�����Œ��˕Ԃ�悤�ɂ���B
 */
import java.awt.Color;
import java.lang.String;
import javax.swing.JFrame;
import javax.swing.Timer;

public class BallReflection extends JFrame {
    final static int C00 = 30;

    public BallReflection() {
        DrawPanel L00 = new DrawPanel();
        add(L00);

        new Timer(C00, L00).start();
    }

    public static void main(String[] A00) {
        JFrame L00 = new BallReflection();
        L00.setTitle("���˂���{�[��");
        L00.setDefaultCloseOperation(EXIT_ON_CLOSE);
        L00.setBackground(Color.white);
        L00.setResizable(false);
        L00.pack();
        L00.setVisible(true);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�O���t�B�b�N�����I�ɕ`�悷��A�܂�A�j���[�V����������ɂ́A���Ԋu
�ŃC�x���g�𔭐�������d�g�݂��K�v�ł��B���̃v���O�����ł�
javax.swing.Timer���g���āA��0.03�b���ƂɁi���b��33��j�A
java.awt.event.ActionEvent�𔭐������Ă��܂��B

�Q�[���ł́A���b30���ʂ�����������u�b30�t���[���v�����ϓI�ł��ˁB����
�����񐔂𑝂₷�قǁA�A�j���[�V�������X���[�Y�ɂȂ�킯�ł����A�b60�t
���[���ȏ�́A�����瑝�₵�Ă������Ɍ����܂��B�l�Ԃ̖ڂ̌��E���Ă̂�����
�܂����A��ʓI�ȃp�\�R���̃f�B�X�v���C�́A���b60�`85�񂭂炢�ŉ�ʂ��X�V
���Ă��ŁA����ȏ����Ă����ʂȂ킯�ł��B�ނ���A���₵������ƕ`���
�������Ԃ�����āu�d���v�Ȃ�̂ŁA�C�����Ă��������B

�t�Ɍ��炷�ꍇ�́A�����̏��Ȃ����̂Ȃ�A�b15�t���[���ł�����Ȃ�Ɍ�����
����܂��B���̕ӂ̓o�����X�̖��ł��̂ŁA���ۂɎ����Ċ��G������ł���
�����B
 */
