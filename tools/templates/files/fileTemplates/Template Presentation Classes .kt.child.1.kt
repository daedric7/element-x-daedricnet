#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.node.Node
import com.bumble.appyx.core.plugin.Plugin
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import io.element.android.anvilannotations.ContributesNode
import io.element.android.libraries.di.AppScope

// CHANGE THE SCOPE
@ContributesNode(AppScope::class)
class ${NAME}Node @AssistedInject constructor(
    @Assisted buildContext: BuildContext,
    @Assisted plugins: List<Plugin>,
    private val presenter: ${NAME}Presenter,
) : Node(buildContext, plugins = plugins) {

    @Composable
    override fun View(modifier: Modifier) {
        val state = presenter.present()
        ${NAME}View(
            state = state,
            modifier = modifier
        )
    }
}