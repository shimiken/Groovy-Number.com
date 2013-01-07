/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "UrlCollector"
 * UrlCollector.java �u���K�\�����g����Web�T�C�g���烊���N�𒊏o�v
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac UrlCollector.java
 *     >java UrlCollector
 * �y�L�[���[�h�z
 *     URL(Uniform Resource Locator), �������{�b�g(search robot),  *     ���K�\��(regular expression), java.util.regex.Pattern�N���X,
 * �y�����Ă݂悤�z
 *     ���W����URL�����ƂɁA�����URL�����W����B *     Web�y�[�W�Ɋ܂܂��摜�̃����N�����W����B
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.lang.System;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlCollector {
    static final String C00 = "http://www.groovy-number.com/link.html";
    static final String C01 = "<a href=\"([^\"]+)\">";

    public static void main(String[] A00) {
        System.out.printf("[%s]����AURL������...%n", C00);
        int L00 = 0;

        try {
            URL L01 = new URL(C00);
            BufferedReader L02 = new BufferedReader(new InputStreamReader(
                    L01.openStream()));

            String L03;
            Pattern L04 = Pattern.compile(C01, Pattern.CASE_INSENSITIVE);

            while ((L03 = L02.readLine()) != null) {
                Matcher L05 = L04.matcher(L03);
                while (L05.find()) {
                    L00++;
                    System.out.println(L05.group(1));
                }
            }
            
            L02.close();
        } catch (IOException L06) {
            System.out.println("�y�[�W�ǂݍ��ݒ��ɃG���[���N���܂����B");
        }

        System.out.println(L00 + "����URL�𔭌����܂����B");
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
Google�ɑ�\�����u���{�b�g�^�����G���W���v�Ƃ����̂�����܂��B����͌�
�����{�b�g�i�N���[���[�A�X�p�C�_�[�Ƃ��Ă΂��j���A�S���E��Web�T�C�g��
�����I�ɏ��񂵂āAWeb�y�[�W���f�[�^�x�[�X�ɕۑ����Ă����d�g�݂ɂȂ��Ă�
���B

���̏���̊�{�ɂȂ��Ă�̂��A���̃T���v���̂悤�ɁA����y�[�W�Ɋ܂܂��
�����N�𔲂��o���A��������X�ɂ��ǂ邱�ƂŁA�y�[�W�����W�����@�ł��B��
�Ȃ݂ɁA2005�N3�����݁AGoogle��16���ȏ��URL���W�߂Ă���Ƃ̂��ƁB����
�������ˁB

�����N�𔲂��o�����K�\���́A"<a href=\"([^\"]+)\">"�ƂȂ��Ă܂��B����
�́A<a href="�`">�Ƃ���������̃p�^�[�����Ӗ����܂��B�u�`�v�̕����ɂ�
�u[^\"]+�v�Ƃ����\���ŁA�u�_�u���N�I�[�e�[�V����(")�ȊO(^)�̕�����1����
�ȏ�(+)�v�Ƃ����w������Ă��܂��B�u()�v�͕����̃O���[�v����\���A�p�^�[
���Ƀ}�b�`�����ꍇ�A�����o�������������͂�ł��܂��B

���̃p�^�[�����R���p�C������Ƃ��Ɏw�肵���uCASE_INSENSITIVE�v�́A�啶��
����������ʂ��Ȃ��Ƃ����Ӗ��B�܂�<A HREF="�`">�Ƃ����^�O��OK�Ƃ�����
�Ƃł��B

Matcher��find���\�b�h�́A�擪����p�^�[���Ƀ}�b�`���镔�����T�[�`����
���B����ɑO�񔭌������ʒu��ێ����Ă܂��̂ŁA�ēxfind���\�b�h���Ăяo��
����A���̈ʒu�������T���Ă���܂��Bwhile���[�v�Ƒg�ݍ��킹��΁A��
�s�ɕ����̃����N�����݂���ꍇ�ɑΉ��ł��܂��ˁB

���͂��̐��K�\���A���Ȃ�蔲���ł��BURL��"�ň͂��ĂȂ��̂̓_���A�V���O��
�N�I�[�e�[�V����(')�ň͂��Ă��_���Ahref�ȊO�̑���������̂��_���Aa�̌��
�ɃX�y�[�X��2�ȏ゠���Ă��_���c�c�ƂȂ��Ă܂��B���ЁA��苖�e�͈͂̍L
�����K�\���̃p�^�[���𒲂ׂĂ݂Ă��������B
 */
