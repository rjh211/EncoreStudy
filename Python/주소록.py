class Member:
    def __init__(self, name = '', tel = '', address = ''):
        self.name = name
        self.tel = tel
        self.address = address
    def printInfo(self):
        print(self.name, ' / ', self.tel, ' / ', self.address)

class Dao:
    def __init__(self):
        self.members = []

    def insert(self, m):
        self.members.append(m)
    
    def select(self, name):
        for m in self.members:
            if name == m.name:
                return m

    def update(self, member):
        m = self.select(member.name)
        if m == None:
            print('not found, update cancel')
        m.tel = member.tel
        m.address = member.address

    def delete(self, name):
        m = self.select(name)
        if m == None:
            print('not found, delete cancel')
        self.members.remove(m)
    def selectAll(self):
        return self.members
    
class Service:
    def __init__(self):
        self.dao = Dao()

    def addMember(self):
        name = input('name : ')
        tel = input('tel : ')
        address = input('address : ')
        m = Member(name, tel, address)
        self.dao.insert(m)
    def removeMember(self):
        self.dao.delete(input('name : '))

    def updateMember(self):
        self.dao.update(Member(input('name: '), input('tel : '), input('address : ')))
    def selectMember(self):
        i = self.dao.select(input('name: '))
        if i == None:
            print('not found')
            return
        print(i.name,' / ',i.tel,' / ',i.address)
    def selectAll(self):
        members = self.dao.selectAll() 
        for i in members:
            print(i.name,' / ',i.tel,' / ',i.address)

def main():
    service = Service()
    select = 0
    while select != 6:
        select = int(input("1.add 2.remove 3.update 4.select 5.selectAll 6.exit\n"))
        if select == 1:
            service.addMember()
        elif select == 2:
            service.removeMember()
        elif select == 3:
            service.updateMember()
        elif select == 4:
            service.selectMember()
        elif select == 5:
            service.selectAll()
        else:
            print("종료 합니다.")
            break

main()