/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "BallReflection"
 * DrawPanel.java �u�E�B���h�E�̓����𔽎˂���{�[���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java BallReflection
 * �y�L�[���[�h�z
 *     �C�x���g�쓮(event-driven)�v���O����, �R���|�[�l���g�̍ĕ`��(repaint),  *     �R�[���o�b�N(callback)���\�b�h, *     �C�x���g�f�B�X�p�b�`�X���b�h(event dispatch thread), 
 * �y�����Ă݂悤�z
 *     �{�[���̐��𑝂₵�Ĕz��ŊǗ�����B
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;

public class DrawPanel extends JPanel implements ActionListener {
    static final int C00 = 300;
    static final int C01 = 200;

    Ball I00 = new Ball(50);
    
    public DrawPanel() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(C00, C01));
    }

    public void actionPerformed(ActionEvent A00) {
        I00.M00();
        repaint();
    }

    public void paintComponent(Graphics A00) {
        super.paintComponent(A00);

        Graphics2D L00 = (Graphics2D)A00;
        L00.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
        I00.M01(L00);
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
���̃N���X�̃��\�b�h�́A�S�āA���߂��炿���Ƃ������O���t���Ă���܂��B
����́i�R���X�g���N�^�[�������āj�A�v���O���}�[�����ڌĂяo���̂ł͂�
���ASwing���ɌĂяo���Ă��炤�R�[���o�b�N���\�b�h������ł�

�����̗���𗝉�����ɂ́A�ǂ̃^�C�~���O�Ń��\�b�h���Ăяo����邩��m��
�̂��|�C���g�ŁA���ɁATimer��actionPerformed()�̊֌W�A�y�сArepaint()��
paintComponent()�̊֌W�͏d�v�ł��B

BallReflection�N���X�Ő�������Timer�ɂ��A����I��Action�C�x���g������
���A���̂ǁAactionPerformed���Ă΂�܂��B�����ɕ`�惁�\�b�h�������΁A
�A�j���[�V���������������킯�ł����A���ۂ́A�{�[���̍��W���X�V����̂�
�ŁA�`��͍s�킸�Arepaint()�Ńp�l���́u�ĕ`��v���v���o���ɂƂǂ܂��Ă�
���B���́u�ĕ`��v���v���o���ꂽ��ApaintComponent()���Ăяo����A���ۂ�
��ʂɃ{�[�����`�悳���Ƃ����d�g�݂ɂȂ��Ă܂��B

���̂悤�ɁAGUI�v���O���~���O�ł́A���ڃ��\�b�h���Ăяo���̂ł͂Ȃ��A�C
�x���g�Ƃ����u�d�g�݁v�𗘗p���ă��\�b�h���Ăяo���܂��B������v���O��
�}�[�����ڂ�����ꍇ�ɂ́A�K�v�ȂƂ��ɉ�ʂ̕`�悪�Ȃ��ꂸ�ɕ\�������ꂽ
��A�E�B���h�E�𑀍삵�悤�ɂ��������Ȃ��Ȃǂ̖�肪�N����\���������
���B�R�[���o�b�N���\�b�h�ł́A�������������ɁA�f�����V�X�e���ɏ�����Ԃ�
�̂��A�����̑f����GUI�\�z�̃J�M�ɂȂ�܂��B
 */
