##
## Bayes.
##

clear ; close all; clc;

datos = readFile("Iris2Clases.txt");

#X=[[50,250,200];[10,254,180];[20,240,210];[40,248,190];[56,254,202]]

matr_clase1 = procesarDatos(datos, 'Iris-setosa');
matr_clase2 = procesarDatos(datos, 'Iris-versicolor');

[m1, C1] = calcularMyC(matr_clase1)
[m2, C2] = calcularMyC(matr_clase2)

#Ahora cargamos los nuevos datos y vemos en que clase está
#Llamanos J a la diferencia respecto a cada clase

test1 = readFile("TestIris01.txt");
matr_test1 = procesarDatos(test1, 'Iris-setosa')
test2 = readFile("TestIris02.txt");
matr_test2 = procesarDatos(test2, 'Iris-versicolor')
test3 = readFile("TestIris03.txt");
matr_test3 = procesarDatos(test3, 'Iris-setosa')

#Cada ejemplo corresponderá a la clase que tenga menor J
J1_setosa = (( matr_test1 - m1 ) * inv(C1) *  ( matr_test1 - m1 )' )
J1_versicolor = (( matr_test1 - m2 ) * inv(C2) *  ( matr_test1 - m2 )' )

J2_setosa = (( matr_test2 - m1 ) * inv(C1) *  ( matr_test2 - m1 )' )
J2_versicolor = (( matr_test2 - m2 ) * inv(C2) *  ( matr_test2 - m2 )' )

J3_setosa = (( matr_test3 - m1 ) * inv(C1) *  ( matr_test3 - m1 )' )
J3_versicolor = (( matr_test3 - m2 ) * inv(C2) *  ( matr_test3 - m2 )' )
