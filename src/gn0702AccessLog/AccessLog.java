/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "AccessLog"
 * AccessLog.java �u���K�\�����g���A�N�Z�X���O����Googlebot�̃A�N�Z�X�����o����v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac AccessLog.java
 *     >java AccessLog
 * �y�L�[���[�h�z
 *     ���K�\��(regular expression), Googlebot, �N���[���[(crawler), *     HTTP�X�e�[�^�X�R�[�h(status code) *     
 * �y�����Ă݂悤�z
 *     Googlebot�ȊO�̃��{�b�g�̃A�N�Z�X�����o����B *     �O�������N(www.groovy-number.com�ȊO)����Q�Ƃ��ꂽ�A�N�Z�X�����o����B
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.System;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccessLog {

    public static void main(String[] A00) {
        String L00 = "access_log.txt";

        try {
            BufferedReader L01 = new BufferedReader(new FileReader(L00));

            Pattern L02 = Pattern.compile(".+ .+ .+ \\[(.+)\\] \"(.+)\" .+ .+ \".+\" \"(.+)\"");
            
            String L03;
            while( (L03 = L01.readLine()) != null ) {
                Matcher L04 = L02.matcher(L03);
                if (L04.matches()) {
                    if (L04.group(3).contains("Googlebot")) {
                        System.out.println("time = " + L04.group(1));
                        System.out.println("http = " + L04.group(2));
                        System.out.println("agent = " + L04.group(3));
                        System.out.println();
                    }

                } else {
                    System.out.println("��͂ł��Ȃ��s������܂����F" + L03);
                }
            }
            L01.close();

        } catch(IOException L05) {
            System.out.println(L00 + "��ǂݍ��ݒ��ɗ�O���������܂����B");
        }

    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Web�T�[�o�[�̃A�N�Z�X���O�ɂ́A���A�ǂ̂悤�Ȍ`�Ńy�[�W���A�N�Z�X����
���̂��A���̋L�^���c���Ă��܂��B�N�����y�[�W���{�������ꍇ�ȊO�ɂ��A����
�G���W�����s���y�[�W�̎������W�̋L�^�Ȃǂ����O�Ɏc��܂��B

Google�̓y�[�W�̎��W��Googlebot�Ƃ����N���[���[�i���{�b�g��X�p�C�_�[��
���Ă΂��j���g�p���Ă���A�A�N�Z�X���O�ɂ����ẮA�u���E�U�[�̖��O���c
�镔����"Googlebot"�Ƃ����������܂񂾖��O���c���܂��B����͂��̃f�[�^��
�݂𒊏o���Ă݂܂����B

���̃T���v����ǂ݉����O�ɁA�t����access_log.txt���J���āA�A�N�Z�X���O��
�ǂ�Ȃ��̂����m�F���Ă����Ă��������B���O�̌`���̓X�y�[�X��؂�ŁA�u�z
�X�g�� ���ʏ�� �F�؃��[�U�[ ���� ���N�G�X�g �X�e�[�^�X ���M�o�C�g�� �Q
�ƌ� �u���E�U�[���v�ƂȂ��Ă܂��B

���K�\���̒��ɂ�"()"������܂����A����̓p�^�[�����}�b�`��������A���̕�
���𔲂��o�����߂̂��̂ł��B�Ⴆ�΁AMatcher��group(3)�Ƃ������\�b�h�́u3
�Ԗڂ�()�v�܂�u���E�U�[�����擾���邱�ƂɂȂ�܂��B
 */
