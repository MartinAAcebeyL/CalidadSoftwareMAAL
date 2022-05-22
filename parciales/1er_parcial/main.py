from tests import *
def correr_test():
    """
    corre todos los test escritos en test.py y se detiene en los errados
    """
    test_palindromo_ana()
    test_palindromo_avepera()
    test_palindromo_alli_sevilla()
    test_palindromo_mercedes_crema()
    test_palindromo_aibofobia()

if __name__ == "__main__":
    correr_test()