from algoritmos import *
#test incorrectos

# def test_palindromo_ana():
#     assert palindromo("ana "), "Error, 'ana' no es palindromo"

# def test_palindromo_avepera():
#     assert palindromo("arepera "), "Error, 'avepera' no es palindromo"

# def test_palindromo_alli_sevilla():
#     assert palindromo("alli ves sevilla "), "Error, 'alli ves sevilla' no es palindromo"

# def test_palindromo_mercedes_crema():
#     assert palindromo("A mercedes ese de crema "), "Error, 'A mercedes ese de crema' no es palindromo"

# def test_palindromo_aibofobia():
#     assert palindromo("aibofobia "), "Error, 'aibofobia' no es palindromo"


#test incorrectos que funcionan
# def test_palindromo_ana():
#     assert palindromo("ana"), "Error, 'ana' no es palindromo"

# def test_palindromo_avepera():
#     assert palindromo("arepera"), "Error, 'avepera' no es palindromo"

# def test_palindromo_alli_sevilla():
#     assert palindromo("allivessevilla"), "Error, 'alli ves sevilla' no es palindromo"

# def test_palindromo_mercedes_crema():
#     assert palindromo("Amercedesesedecrema"), "Error, 'A mercedes ese de crema' no es palindromo"

# def test_palindromo_aibofobia():
#     assert palindromo("aibofobia"), "Error, 'aibofobia' no es palindromo"

#test correctos
def test_palindromo_ana():
    assert palindromo("ana"), "Error, 'ana' no es palindromo"

def test_palindromo_avepera():
    assert palindromo("arepera"), "Error, 'avepera' no es palindromo"

def test_palindromo_alli_sevilla():
    assert palindromo("alli ves  sevilla"), "Error, 'alli ves sevilla' no es palindromo"

def test_palindromo_mercedes_crema():
    assert palindromo("A mercedes ese de  crema"), "Error, 'A mercedes ese de crema' no es palindromo"

def test_palindromo_aibofobia():
    assert palindromo("aibofobia"), "Error, 'aibofobia' no es palindromo"