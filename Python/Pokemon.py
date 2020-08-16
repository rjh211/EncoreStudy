class Pokemon:
    def __init__(self, hp):
        self.hp = hp
        self.exp = 0
        self.level = 1 
    def Eating(self):
        pass
    def Sleeping(self):
        pass
    def Playing(self):
        pass
    def Excer(self):
        pass
    def LevelUp(self):
        if self.exp >= 20 :
            self.exp -= 20
            self.level += 1
    def PrintInfo(self):
        print('hp : ', self.hp, 'exp : ', self.exp, 'level : ', self.level)
    def IsLive(self):
        if self.hp <= 0: 
            print('죽었습니다.')
            return True
        return False

class Pikachu(Pokemon):
    def __init__(self, hp):
        super().__init__(hp)
    def Eating(self):
        self.hp += 5
    def Sleeping(self):
        self.hp += 9
    def playing(self):
        self.hp -= 4
        self.exp += 5
        self.LevelUp()
        return self.IsLive()
    def Excer(self):
        self.hp -= 6
        self.exp += 8
        self.LevelUp()
        return self.IsLive()

class Squirtle(Pokemon):
    def __init__(self, hp):
        super().__init__(hp)
    def Eating(self):
        self.hp += 4
    def Sleeping(self):
        self.hp += 8
    def playing(self):
        self.hp -= 3
        self.exp += 5
        self.LevelUp()
        return self.IsLive()
    def Excer(self):
        self.hp -= 5
        self.exp += 8
        self.LevelUp()   
        return self.IsLive()
        
def main():
    switch = 0
    # pokemon = Pokemon()
    switch = int(input('1.피카츄 2.꼬부기'))
    if switch == 1:
        pokemon = Pikachu(20)
    elif switch == 2:
        pokemon = Squirtle(25)
    else: 
        print('잘못된 번호 입력')
        return
    print('케릭터 선택 완료.')

    while switch != 11:
        switch = int(input('1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.정보 보기 11.종료'))
        if switch == 1: pokemon.Eating()
        elif switch == 2 : pokemon.Sleeping()
        elif switch == 3 : pokemon.playing()
        elif switch == 4 : 
            if pokemon.Excer() == True: return
        elif switch == 5 : 
            if pokemon.PrintInfo() == True: return
        else : 
            print('종료 합니다.')
            break
main()