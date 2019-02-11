class Singleton:
    __instance = None
    def __init__(self):
        if not Singleton.__instance:
            print(" __init__ method called..")
        else:
            print("Instance already created:", self.getInstance())
    @classmethod
    def getInstance(cls):
        if not cls.__instance:
            cls.__instance = Singleton()
        return cls.__instance

print("First Call")
a = Singleton()    
print("Object created: ", Singleton.getInstance())

print("Second Call")
b = Singleton()
print("Object created: ", b)