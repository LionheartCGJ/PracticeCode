-- ����洢���̵������ǣ�����һ��ѧ�ţ�
-- ����С�����ѧ�ŵ�ѧ����ƽ���ɼ�


-- ���廻�з�
delimiter //

DROP PROCEDURE IF EXISTS sp_getave;
-- �����洢����sp_getave,
-- �������������ֱ���һ�����������һ���������
CREATE PROCEDURE sp_getave(IN input INT, OUT output INT)
-- �洢���̿�ʼ
BEGIN
-- �洢��������
	SELECT 
		@sum := @sum + value 
	FROM student s, (SELECT @sum := 0) v
	WHERE s.id < input;
	SET output := @sum / (input - 1);
-- �洢���̽�����ע�⣺END����Ҫ���ϻ��з���־�������ʼ�����
END //

-- �����з�������
delimiter ;

-- ִ��
CALL sp_getave(4,@output);
-- �鿴������
SELECT @output;