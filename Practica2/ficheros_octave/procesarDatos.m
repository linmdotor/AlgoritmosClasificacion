function resultado = procesarDatos(datos)
%
% devuelve una matriz con los elementos de un texto
%

% Inicializa el resultado
#resultado=0;

% ========================== Tokenize Email ===========================


% Process file
fila = 1;
columna = 1;

%Genera una matriz con los datos
while ~isempty(datos)

  [str, datos] = strtok(datos, "\n");

  columna = 1;
  while ~isempty(str)

    [split, str] = strtok(str, ",");

    if(strcmp(strtrim(split), 'Iris-setosa'))
      resultado(fila,columna) = 0;
    elseif(strcmp(strtrim(split), 'Iris-versicolor'))
      resultado(fila,columna) = 1;
    else
      resultado(fila,columna) = str2double(split);
    endif

    columna = columna+1;

  end
  
  fila = fila+1;

end


end
