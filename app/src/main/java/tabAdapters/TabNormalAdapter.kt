package tabAdapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import fragments.CallsFragments
import fragments.ChatsFragments
import fragments.StatusFragments

class TabNormalAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return   when(position){
            0->{
                ChatsFragments()
            }
            1->{
                StatusFragments()
            }
            2->{
                CallsFragments()
            }
            else->{
                Fragment()
            }

        }
    }
}