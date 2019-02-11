class Singleton(object):
    def __new__(cls):
        if not hasattr(cls,'instance'):
            cls.instance = super(Singleton, cls).__new__(cls)
        return cls.instance

a = Singleton()
print("Object created: ", a)

b = Singleton()
print("Object created: ", b)