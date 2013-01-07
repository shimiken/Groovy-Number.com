/**
 * ����Java256�{�m�b�N for Java 5.0
 * Java�T���v���\�[�X ver0.2C "CsvData"
 * CsvData.java �uCSV�t�@�C����ǂݍ��ށv
 *
 * 2005/09/23 ����F���i�m���J�Y
 *
 * �y�R���p�C�������s���@�z
 *     >javac CsvData.java
 *     >java CsvData
 * �y�L�[���[�h�z
 *     CSV(Comma Separated Values:�J���}��؂�f�[�^),  *     ���K�\��(regular expression), ��O(exception),  *     IO(Input/Output:���o��), �X�g���[��(stream:����), 
 * �y�����Ă݂悤�z
 *     finally�߂𗘗p���A��O���������Ă��m���Ƀt�@�C�����N���[�Y����悤�ɂ���B *     Excel�̃V�[�g��CSV�`���ŏo�͂��āAJava�œǂݍ��ݕ\������B
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.System;

public class CsvData {
    public static void main(String[] A00){
        String L00 = "busyo.csv";

        try {
            BufferedReader L01 = new BufferedReader(new FileReader(L00));
            String L02;
            while( (L02 = L01.readLine()) != null ) {
                String[] L03 = L02.split(",");
                System.out.printf("%s [����:%3s �R��:%3s �q�d:%3s ��]:%3s]%n",
                        L03[0], L03[1], L03[2], L03[3], L03[4]);
            }
            L01.close();
        } catch(FileNotFoundException L04) {
            System.out.println(L00 + "��������܂��ł����B");
        } catch(IOException L05) {
            System.out.println(L00 + "��ǂݍ��߂܂���ł����B");
        }
    }
}

/* �� �N���X�̊O�ł�����ƈꌾ ��
CSV�Ƃ́u�f�[�^���J���}�ŋ�؂�ŋL�q�����e�L�X�g�t�@�C���v�̂��Ƃł��B
busyo.csv�t�@�C�����G�f�B�^�ŊJ���Ē��g���m�F���Ă����Ă��������BExcel��
�f�[�^�𗘗p�������Ƃ��́A*.csv�`���ŏ����o���Ă����āA���̂悤�ɂ��ē�
�ݍ��߂΂n�j�ł��iJakarta POI�Œ��ړǂޕ��@������܂��j�B

�����̕������s���Ă���split���\�b�h�́A���K�\��(java.util.regex�p�b�P�[
�W)���̗p���ꂽJ2SE1.4�ŁA�V���ɒǉ����ꂽ���\�b�h�ł��B����܂ł́A
java.util.StringTokenizer�𗘗p���āAwhile���[�v�Ŏ��o���Ă�����ł�
���A�ꔭ�Ŕz��ɕϊ��ł���悤�ɂȂ��ĕ֗��ɂȂ�܂����ˁB

���Ȃ݂ɁA�l���ł�������퍑�V�~�����[�V�����Q�[���́A�V�X�e���\�t�g��
�w�V������x�B�V���v���ȃV�X�e���ƁA��B�̕����̃p�����[�^�������Ƃ��낪
�O�b�h�ł��B
 */
