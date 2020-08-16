import cx_Oracle
class Test:
    def __init__(self, num=None, name=None, price=None, desc=None):
        self.num = num
        self.name = name
        self.price = price
        self.desc = desc

    def print(self):
        print('num:',self.num,'/ name:',self.name,'/ price:',self.price,'/ descript:', self.desc)

class Dao_test:
    def select_all(self):
        conn = cx_Oracle.connect("hr", "hr", "localhost:1521/xe", encoding='utf-8')
        cursor = conn.cursor()
        sql = 'select * from test'
        cursor.execute(sql)
        datas = []
        for row in cursor:
            datas.append(Test(row[0],row[1],row[2],row[3]))
        conn.close()
        return datas
    def select(self, num):
        conn = cx_Oracle.connect("hr", "hr", "localhost:1521/xe", encoding='utf-8')
        cursor = conn.cursor()
        sql = 'select * from test where num=:1'
        d = (num,)
        cursor.execute(sql, d)
        row = cursor.fetchone()
        conn.close()
        if row is not None:
            return Test(row[0], row[1], row[2], row[3])

    def insert(self, t):
        conn = cx_Oracle.connect("hr", "hr", "localhost:1521/xe", encoding='utf-8')
        cursor = conn.cursor()
        sql = 'insert into test values(seq_test.nextval, :1, :2, :3)'
        d = (t.name, t.price, t.desc)
        cursor.execute(sql, d)
        conn.commit()           #jdbc와 달리 commit이 필수이다.
        conn.close()

    def update(self, t):
        conn = cx_Oracle.connect("hr", "hr", "localhost:1521/xe", encoding='utf-8')
        cursor = conn.cursor()
        sql = 'update test set price=:1, "desc"=:2 where num=:3'  #자바의 ?와 같다. 아랫줄에서 :1,:2,:3 에 대한 변수 추가 binding
        d = (t.price, t.desc, t.num)
        cursor.execute(sql, d)
        conn.commit()
        conn.close()

def main():
    dao = Dao_test()
    # dao.insert(Test(0, 'ccc', 1500, 'info3'))
    dao.update(Test(1, '', 2500, '가나다'))
    datas = dao.select_all()
    for t in datas:
        t.print()

main()
