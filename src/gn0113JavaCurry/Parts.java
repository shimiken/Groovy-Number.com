/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "JavaCurry"
 * Parts.java �u�J���[�̃p�b�P�[�W���I�u�W�F�N�g�w���ŕ\���v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac *.java
 *     >java JavaCurry
 * �y�L�[���[�h�z
 *     �C���^�[�t�F�[�X(interface)
 * �y�����Ă݂悤�z
 *     JavaCurry.java�Q�ƁB
 */
import java.awt.Graphics;

public interface Parts {
    public void M00(Graphics A00);
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
�C���^�[�t�F�[�X�Ƃ́A�N���X�́u�U�镑�����v�݂̂��`������̂ł��B����
Parts�C���^�[�t�F�[�X�́A�uGraphics�I�u�W�F�N�g���󂯎���āA�`�悷��v
�Ƃ���������`���Ă��܂��̂ŁAM00�ɂ́u�����ɂ��`�悵�����v�Ȗ��O����
���Ă����Ă��������B
��̓I�ɂǂ̂悤�ɕ`�悷�邩�́A���̃C���^�[�t�F�[�X���������Ă���ABox,
Circle, Text�̊e�N���X�ł��ꂼ��L�q���Ă܂��B

JavaCurry�ł́A����Parts�C���^�[�t�F�[�X���A�s���b�ƌ������X�p�C�X�ɂȂ�
�Ă܂��̂ŁADrawPanel.java�ɂāA���̃C���^�[�t�F�[�X���ǂ̂悤�ɗ��p����
�Ă�̂��A���̕������������育�ܖ����������B
 */
