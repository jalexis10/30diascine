package com.example.a30diascine.data
import com.example.a30diascine.R


data class Movie(
    val day: Int,
    val title: String,
    val imageRes: Int,
    val synopsis: String
)


val movieList = listOf(
    Movie(1, "El Padrino", R.drawable.padrino, "Un clásico del cine sobre la mafia italiana en Nueva York y el ascenso al poder de Michael Corleone."),
    Movie(2, "Interestelar", R.drawable.interstellar, "Una odisea espacial que explora los límites del tiempo y espacio en busca de un nuevo hogar para la humanidad."),
    Movie(3, "El club de la pelea", R.drawable.fight_club, "Un hombre con insomnio y un misterioso amigo inician un club clandestino de peleas que evoluciona hacia algo mucho más siniestro."),
    Movie(4, "El caballero oscuro", R.drawable.dark_knight, "Batman se enfrenta a su archienemigo, el Joker, en una batalla por el alma de Ciudad Gótica."),
    Movie(5, "Pulp Fiction", R.drawable.pulp_fiction, "Varias historias entrelazadas de criminales, boxeadores y gángsters en Los Ángeles."),
    Movie(6, "La lista de Schindler", R.drawable.schindler, "La historia real de Oskar Schindler, un empresario que salvó la vida de más de mil judíos durante el Holocausto."),
    Movie(7, "El señor de los anillos: El retorno del rey", R.drawable.return_king, "La conclusión épica de la trilogía donde Frodo debe destruir el Anillo Único en el Monte del Destino."),
    Movie(8, "Matrix", R.drawable.matrix, "Un programador descubre que la realidad es una simulación creada por máquinas que esclavizan a la humanidad."),
    Movie(9, "Forrest Gump", R.drawable.forrest_gump, "La vida extraordinaria de un hombre con limitaciones intelectuales que influye inadvertidamente en eventos históricos."),
    Movie(10, "Cadena perpetua", R.drawable.shawshank, "Un banquero condenado injustamente forja una amistad con otro recluso mientras busca su redención en prisión."),
    Movie(11, "Ciudadano Kane", R.drawable.citizen_kane, "La investigación sobre el significado de las últimas palabras de un magnate de los medios revela su compleja vida."),
    Movie(12, "Parásitos", R.drawable.parasite, "Una familia pobre se infiltra en el hogar de una familia adinerada, desencadenando una serie de eventos inesperados."),
    Movie(13, "El silencio de los corderos", R.drawable.silence_lambs, "Una agente del FBI busca la ayuda de un brillante psiquiatra y caníbal para atrapar a un asesino en serie."),
    Movie(14, "Tiburón", R.drawable.jaws, "Un sheriff, un biólogo marino y un pescador cazan un tiburón que aterroriza a una comunidad costera."),
    Movie(15, "2001: Una odisea del espacio", R.drawable.space_odyssey, "Un viaje monumental a través del tiempo y el espacio que explora la evolución humana y la inteligencia artificial."),
    Movie(16, "Psicosis", R.drawable.psycho, "Una secretaria en fuga se hospeda en un remoto motel dirigido por un inquietante hombre con problemas con su madre."),
    Movie(17, "Casablanca", R.drawable.casablanca, "En la Segunda Guerra Mundial, un expatriado americano debe elegir entre su amor por una mujer y ayudarla a escapar con su esposo."),
    Movie(18, "Ciudad de Dios", R.drawable.city_god, "El crecimiento del crimen organizado en un suburbio de Río de Janeiro desde los años 60 hasta los 80."),
    Movie(19, "Vértigo", R.drawable.vertigo, "Un detective con miedo a las alturas es contratado para seguir a la esposa de un amigo, aparentemente poseída."),
    Movie(20, "La vida es bella", R.drawable.life_beautiful, "Un padre judío utiliza su imaginación para proteger a su hijo de los horrores de un campo de concentración nazi."),
    Movie(21, "El resplandor", R.drawable.shining, "Una familia aislada en un hotel durante el invierno es amenazada por fuerzas sobrenaturales que despiertan la locura del padre."),
    Movie(22, "El viaje de Chihiro", R.drawable.spirited_away, "Una niña entra en un mundo mágico dominado por espíritus, dioses y brujas, donde debe luchar para salvar a sus padres."),
    Movie(23, "Star Wars: El Imperio contraataca", R.drawable.empire_strikes, "La rebelión lucha contra el Imperio mientras Luke Skywalker aprende los caminos de la Fuerza con el maestro Yoda."),
    Movie(24, "Apocalypse Now", R.drawable.apocalypse_now, "Durante la Guerra de Vietnam, un capitán es enviado a asesinar a un coronel renegado que se ha proclamado un dios entre nativos."),
    Movie(25, "Gladiador", R.drawable.gladiator, "Un general romano traicionado regresa a Roma como gladiador para vengarse del emperador corrupto que asesinó a su familia."),
    Movie(26, "El laberinto del fauno", R.drawable.pans_labyrinth, "En la España de posguerra, una niña se escapa a un mundo fantástico para escapar de la brutalidad de su padrastro."),
    Movie(27, "El gran dictador", R.drawable.great_dictator, "Charlie Chaplin satiriza el fascismo con la historia de un barbero judío confundido con un dictador tiránico."),
    Movie(28, "Seven", R.drawable.seven, "Dos detectives persiguen a un asesino en serie cuyos crímenes están inspirados en los siete pecados capitales."),
    Movie(29, "Los siete samuráis", R.drawable.seven_samurai, "Un grupo de samuráis es contratado para proteger a un pueblo de bandidos en el Japón feudal."),
    Movie(30, "Cinema Paradiso", R.drawable.cinema_paradiso, "La historia de amor de un niño con el cine en un pequeño pueblo siciliano y su amistad con el proyeccionista local.")
)