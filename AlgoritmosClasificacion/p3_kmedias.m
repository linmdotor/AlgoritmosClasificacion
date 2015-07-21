##
## Agrupamiento borroso (k-medias).
##

clear ; close all; clc;

#Inicializamos la tolerancia y peso exponencial
epsilon = 0.01;
b = 2;

#Cargamos los datos de entrenamiento
datos = readFile("Iris2Clases.txt");

#X=[[1,1,1,2,2,6,6,7,7,7];[1,3,5,2,3,3,4,1,3,5]]

#Aquí se cargarán las matrices de (X x 4)
matr_clase1 = procesarDatos(datos, 'Iris-setosa');
matr_clase2 = procesarDatos(datos, 'Iris-versicolor');
X = [matr_clase1;matr_clase2]

# 1.Extraer el número de muestras "n" a utilizar y el número de clases "k"
n = size(X,1)
k = 2;

# 2.Inicializar los centros "v" y las probabilidades (i=1...c, j=1...n)
v = [[4.6, 3.0, 4.0, 0.0];[6.8,3.4, 4.6, 0.7]]
for i=1:k #Por cada una de las 2 clases
	P = (1./((X.-v(i,:))'*(X.-v(i,:)))) .^ (1/(b-1))
	%P = ((1./((X.-v(i,:))'*(X.-v(i,:)))) .^ (1/(b-1)))    ./    ( sum(    ) .^ (1/(b-1)))
endfor

%P = (1/x_j-v_i) / ()

# 3.Normlizar las probabilidades
%P = P / max(P)

# 4.Obtener vi mediante la ecuación (1)



# 5.Recalcular por medio de la ecuación (2)



# 6.Repetir los pasos 3 a 5 hasta que vi sean más pequeños que epsilon
%while sum( any( v<epsilon )) > 0 #Mientras haya algún valor que sea mayor que epsilon

%endwhile








#Ahora cargamos los nuevos datos y vemos en que clase está
#Llamanos J a la diferencia respecto a cada clase

%test1 = readFile("TestIris01.txt");
%matr_test1 = procesarDatos(test1, 'Iris-setosa')
%test2 = readFile("TestIris02.txt");
%matr_test2 = procesarDatos(test2, 'Iris-versicolor')
%test3 = readFile("TestIris03.txt");
%matr_test3 = procesarDatos(test3, 'Iris-setosa')

#Cada ejemplo corresponderá a la clase que tenga menor J
%J1_setosa = (( matr_test1 - m1 ) * inv(C1) *  ( matr_test1 - m1 )' )
%J1_versicolor = (( matr_test1 - m2 ) * inv(C2) *  ( matr_test1 - m2 )' )

%J2_setosa = (( matr_test2 - m1 ) * inv(C1) *  ( matr_test2 - m1 )' )
%J2_versicolor = (( matr_test2 - m2 ) * inv(C2) *  ( matr_test2 - m2 )' )

%J3_setosa = (( matr_test3 - m1 ) * inv(C1) *  ( matr_test3 - m1 )' )
%J3_versicolor = (( matr_test3 - m2 ) * inv(C2) *  ( matr_test3 - m2 )' )

