    package com.example.webtoon.ui.theme
    
    import android.net.Uri
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.clickable
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.layout.size
    import androidx.compose.foundation.layout.width
    import androidx.compose.foundation.lazy.LazyColumn
    import androidx.compose.foundation.lazy.items
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.layout.ContentScale
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import androidx.navigation.NavController
    import coil.compose.rememberAsyncImagePainter
    import com.example.webtoon.data.Webtoon

    @Composable
    fun HomeScreen(navController: NavController) {
        val webtoonList = listOf(
            Webtoon(
                title = "For My Derelict Favorite",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/for-my-derelict-750x375.webp",
                description = "Hestia enters the fictional world of her favorite novel as a secondary character. She believes she will transfer to the real world once the story ends. However, she finds that the only thing awaiting her is the horrifying death of Hestia’s favorite character. Hestia decides not to be a viewer from the sidelines anymore. She is determined to save her derelict favorite. Read For My Derelict Favorite to know what happens after “happily ever after?\"",
                briefDescription ="Hestia enters the fictional world of her favorite novel as a secondary character.",
                rating = 3.7f

            ),
            Webtoon(
                title = "Castle Swimmer",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/castle-swimmer-750x375.webp",
                description = "If you are looking for a beautiful gay romance read, Castle Swimmer is the best romance fantasy manhwa. What happens when the creator of all creates a divine creature called Beacon, who is supposed to solve the misery of all the creatures? All creatures who belong to multiple species have a prophecy of their own, and the Beacon is supposed to free them from their miseries. Everyone is waiting for the arrival of the divine creature, but no one knows where they are. However, among all those prophecies, one prophecy contains that the prince from the castle of sharks, Siren, is going to kill the Beacon and free his kind from the curse.",
                briefDescription = "If you are looking for a beautiful gay romance read, Castle Swimmer is the best romance fantasy manhwa.",
                rating = 4.5f

            ),
            Webtoon(
                title = "Dark Moon: The Blood Altar",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/Dark-Moon-The-Blood-Altar-750x375.webp",
                description = "Sooha is a young and beautiful woman who is feared by everyone, as they believe that she is a vampire. As a result of this, she never had any friends except one who died mysteriously. Heartbroken, Sooha lost all hope of having a normal life and friends. However, when she transferred to Riverfield, the two most popular groups of boys who were Vampires and Werewolves were mysteriously attracted to her",
                briefDescription = "Sooha is a young and beautiful woman who is feared by everyone, as they believe that she is a vampire.",
                rating = 3.0f

            ),
            Webtoon(
                title = "Your Throne",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/your-throne-750x375.webp",
                description = "Psyche is the one person Medea trusted a lot, the person she always stood up for, and the person she protected when she did it to herself. When Medea lost everything because of Psyche, she did not give up no matter how hard things got and vowed to take revenge. Soon, things started working in Medea’s favor, but wait; there is more to the story than meets the eyes. Your Throne is a stunning amalgamation of themes like power and revenge, and that is what makes this romance fantasy manhwa stand out.",
                briefDescription = "Psyche is the one person Medea trusted a lot, the person she always stood up for, and the person she protected when she did it to herself.",
                rating = 4.3f

            ),
            Webtoon(
                title = "SubZero",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/09/subzero-66ef162e3deac-750x375.webp",
                description = "How would you feel if one day you were supposed to marry your mortal enemy? The one that has killed countless from your kind to protect his own. Clove is the princess of the Dragon clan, soon to be extinct because of being killed by the Crimson prince, also referred to as a monster. Clove decides to accept his proposal to marry him so that the war that has been going on for centuries can come to an end and her people do not have to die mercilessly.",
                briefDescription = "How would you feel if one day you were supposed to marry your mortal enemy?",
                rating = 3.6f

            ),
            Webtoon(
                title = "Suitor Armor",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/suitor-armour-750x375.webp",
                description = "Lucia is the lady-in-waiting for Kirsi, the soon-to-be Queen of the Empire. She was rescued as a child by Kirsi’s father, and from then on, she decided to become Kirsi’s lady-in-waiting. Her life turned better from then on. However, Lucia has a secret of her own; she is not a human but a fairy. Even Kirsi does not know about her secret. One day, when they went to see the Knight’s Tournament, Lucia saw a knight and fell for him at first sight. However, he is not a normal knight; he is a knight made of magic by the Empire’s Mage. ",
                briefDescription = "Lucia is the lady-in-waiting for Kirsi, the soon-to-be Queen of the Empire.",
                rating = 4.5f

            ),
            Webtoon(
                title = "My In-Laws Are Obsessed With Me",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/my-in-laws-750x375.webp",
                description ="Pereshati Jahardt has an unfortunate luck when her mother dies at a young age, and her stepmother and half-sister, along with Pereshati’s lover, plans to kill her. Their plan becomes successful; however, miraculously, she transports back in time just before her murder. Hence, she plans revenge against them. Not long after, she proposes to Grand Duke, Therdeo Lapilean, to marry her to take her revenge in exchange for helping him find the truth about his family secret." ,
                briefDescription = "Pereshati Jahardt has an unfortunate luck when her mother dies at a young age, and her stepmother and half-sister, along with Pereshati’s lover, plans to kill her.",
                rating =2.9f

            ),
            Webtoon(
                title = "Act Like You Love Me!",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/09/act-like-you-love-me-750x375.webp",
                description = "The central character of Act Like You Love Me! Ji-won is a 25-year-old penniless, overworked, and stressed woman who, after a mix-up, gets a job to be the personal assistant of 26-year-old popular actor Doyun Nam. When she takes her anger out on a doll, she realizes that it has a mysterious ability to take over him at her whim. Now, it’s Ji-won’s turn to act like the boss.",
                briefDescription = "The central character of Act Like You Love Me! Ji-won is a 25-year-old penniless, overworked, and stressed woman.",
                rating = 4.7f


            ),
            Webtoon(
                title = "Eaternal Nocturnal",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/eaternal-750x375.webp",
                description = "Eve has never met the expectations of her parents. When she again loses her job because of insomnia, she takes up a ghost singing gig. However, now that her financial condition is resolved temporarily, she can find a way to try to cure her insomnia. And, in the form of a cure, a handsome and mysterious dream eater visits her in her sleep. Read Eaternal Nocturnal to know how their story ends",
                briefDescription = "Eve has never met the expectations of her parents.",
                rating = 3.5f

            ),
            Webtoon(
                title = "From A Knight to A Lady",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/from-a-knight-to-a-lady-750x375.webp",
                description = "Estelle is a young knight in the Kingdom of Ersha who fought with immense strength until her last breath for her country. Sadly, her most trusted comrade kills her. Miraculously, 3 years later, she finds herself reincarnated as Lucifella, the rumored partner of the crown prince of Jansgar, the enemy kingdom. What’s more? She is now the betrothed of Duke Heint, her mortal enemy from her last life.",
                briefDescription ="Estelle is a young knight in the Kingdom of Ersha who fought with immense strength until her last breath for her country.",
                rating = 4.3f

            ),
            Webtoon(
                title = "The Witch and the Bull",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/the-witch-and-the-bull-750x375.webp",
                description = "Deo is trying to live a peaceful life, but his friend and advisor, Tan, denies this. Tan believes that if they show any signs of weakness, the witches will try to control them. When Tan goes to a popular cafe and learns that it is run by a beautiful witch named Aro, he uses his power to shut it down, and this changes his fate. And the only way to undo this curse is to rely on Aro. Can Aro’s kindness change Tan and finally break this spell?",
                briefDescription = "Deo is trying to live a peaceful life, but his friend and advisor, Tan, denies this.",
                rating = 2.5f
            ),
            Webtoon(
                title = "I’m the Queen in this Life",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/Im-the-queen-in-this-life-750x375.webp",
                description = "Ariadne is the illegitimate daughter of a nobleman who is married to the king’s illegitimate son. Her husband Cesare conspires with her to kill his half-brother, the crown prince, to take over the throne for himself. Their plan is successful, but Ariadne’s life turns upside down when she finds her husband to betray her and marries her half-sister instead. What is more, her sister is the one who put the dagger in her heart. Ultimately, she vows to take revenge, and the heavens listen to her. She is sent back in time when she was 17 years old.",
                briefDescription = "Ariadne is the illegitimate daughter of a nobleman who is married to the king’s illegitimate son.",
                rating = 3.5f

            ),
            Webtoon(
                title = "Leveling Up My Husband to the Max",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/Leveling-up-my-husband-to-the-max-750x375.webp",
                description = "The central character of Leveling Up My Husband to the Max, Amber, is in turmoil with her controlling mother-in-law and cruel husband. Following the time-travel theme, Amber is sent back 10 years into the past, and she confronts her husband, who now adores her. With her knowledge of the potential future, she tries to change her husband, navigate the complexities of the past, and create a new narrative for herself.",
                briefDescription = "The central character of Leveling Up My Husband to the Max, Amber, is in turmoil with her controlling mother-in-law and cruel husband.",
                rating = 4.8f

            ),
            Webtoon(
                title = "Villain to Kill",
                imageUrl = "https://animemangatoon.com/wp-content/uploads/2024/06/Villain-to-kill-750x375.webp",
                description = "Cassian Lee is a Pysker, a very powerful one at that. Psykers are people with inhumane abilities, and they use them to fight evil and protect the weak. While. Villians are the ones just as strong, but they use their ability to make people miserable. When Cassion’s only guardian, Jeff, died in front of him, he lost all hope. All he wanted was revenge, but he died helplessly. However, he woke up in the body of a villain because of the necklace Jeff gave him. What will he do now? Will he give in to his villain instincts or fight the evils instead? Read to the Villain to Kill webtoon to know more.",
                briefDescription = "Cassian Lee is a Pysker, a very powerful one at that.",
                rating = 3.7f

            )
        )


        LazyColumn {
            items(webtoonList) { webtoon ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("detail/${Uri.encode(webtoon.title)}/${Uri.encode(webtoon.imageUrl)}/${Uri.encode(webtoon.description)}/${Uri.encode(webtoon.briefDescription)}/${webtoon.rating}")
                        }
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(webtoon.imageUrl),
                        contentDescription = webtoon.title,
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Column {
                        Text(text = webtoon.title,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp)
                        Text(text = webtoon.briefDescription, fontSize = 14.sp)

                    }
                }
            }
        }
    }