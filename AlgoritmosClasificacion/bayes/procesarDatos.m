function resultado = procesarDatos(datos, string)
%
% filtra una matriz con los elementos de un texto, menos la ultima columna
% busca en la ultima columna y si corresponde al string, la añade a la matriz resultado
%

% ========================== Tokenize Email ===========================


% Process file
fila = 1;
columna = 1;

%Genera una matriz con los datos
while ~isempty(datos)

  [str, datos] = strtok(datos, "\n");

  resultadoparcial = 0;
  columna = 1;
  while ~isempty(str)

    [split, str] = strtok(str, ",");

    resultadoparcial(1,columna) = str2double(split);

    if(strcmp(strtrim(split), string)) #si es la clase que estamos buscando, añadimos la fila
      resultado(fila,:) = resultadoparcial(1,1:size(resultadoparcial,2)-1);
    
      fila = fila+1;
    endif

    columna = columna+1;

  end

end


end
