/* Scenario:
Imagine you are creating a forum for coders in a programming community.
In that forum, the user can create a post. For instance, they may talk in their post about their
code or projects. Other coders in that forum can choose a comment to add to that post.
In addition, the users can choose a relationship type. This indicates the relationship between one user
and another. These are relationship types such as ‘work colleague’, ‘friend’ or being a member of the same
sports team. Finally, you will include the ability for the author of a post to block other users from commenting on the post.*/
//Step  1
class Comment(
    val userId: Int,
    val message: String
)

fun main() {
    // Step  2
    val comments: List<Comment> = listOf(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What’s going on?"),
        Comment(9001, "Check out my website"),
        Comment(8818, "Hello everyone :)")
    )

    // Step 3
    val blockedUserIds: Set<Int> = setOf(5224, 9001)

    // Step 4
    val userIdToRelation: Map<Int, String> = mapOf(
        5241 to "friend",
        6624 to "close friend"
    )

// Step 5
    for (comment in comments) {

        // Step 6
        if (comment.userId !in blockedUserIds) {

            val relation = userIdToRelation[comment.userId] ?: "unknown"

            // Step 7
            println("Comment ${comment.message} from $relation")
        }
    }
}