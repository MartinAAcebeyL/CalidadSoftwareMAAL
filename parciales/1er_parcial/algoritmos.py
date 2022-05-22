#funcion incorrecta
# def palindromo(sentence):
#     sentence = str(sentence).lower().replace("", "")
#     return sentence == sentence[::-1]

#funcion correcta
def palindromo(sentence):
    sentence = str(sentence).lower().replace(" ", "")
    return sentence == sentence[::-1]