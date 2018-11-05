package com.route;


import java.util.*;

public class testReverseString {


	    public static String reverseString(String iniString) {
	        // write code here
	        String returnValue="";
	         for (int i=iniString.length();i>=1;i--)
	         {
	        	 
	             returnValue+=iniString.substring(i-1,i);
	             
	         }
	        return returnValue;
	    }
	    
	    public static String zipString(String iniString) {
	        // write code here
	        String returnValue ="";
	        int count=1;
	        String lastchar=null;
	        
	        for (int i=1; i<=iniString.length();i++)
	        {
	            String temp=iniString.substring(i-1,i);
	            
	            if (temp.equals(lastchar)) count++;
	            else
	            {
	            if (lastchar !=null) 
	            {
	                returnValue = returnValue+lastchar+count;
	            }
	            
	                 lastchar=temp;
	                 count=1;
	            }
	            System.out.println(temp);
	            System.out.println(returnValue);
	        }

		    returnValue = returnValue+lastchar+count;
		    System.out.println(returnValue.replace("1","").length()+returnValue.replace("1",""));
		    System.out.println(iniString.length()+iniString);
	        if (returnValue.replace("1","").length()==iniString.length()) return iniString;
	        else return returnValue;
	    }

	    
		public static void main(String[] args) {
			
			//testReverseString.reverseString("qckzfutq|ws}ejpl~oapz{}eldeedlj{fc}qx~zyjwb|}qkbdxouhb~yobmox~cz~dv}xbrrorgekiveqtkiohldybkpada}l|tvs|huzhvhbdzceoggustjojer{l|acbraylejy}kz|crawmjvyvq{emokxwh}cpyhhpuuz{iqhzpss{ysc~efuljgtc{ynqolagayo}xm}gos{dhs~cnnfpy{buhwaqfprhyyrlcjnxafilkifqb|jhiimjljg}hlhoxicxpzx}|zrbrcnirgjffsmv{et}hshlkhpeydaulawdeincawwfoqiknotjrlqm{lbikxoevqoxceuzokqjzxlreqqumkxdvantiwv~tuuimizkzjztyubawrxk{npsynddpkod|riyeykopvtog|||yodstyihkfkj~|vcsxupbrevrvwtnjpv}nlhtpxphiq|pevhyrnqpuwzwemzfnnwcse}b~oovstk~tqxupp~zjtsl}|j{nqzxnq|tcqxpwfgitzfjcpcglg|djepb}qabiomgqs~ltwclsgj}mjmq~fvgabufpnospuench~garubac|s|otlhquljsenx}rlmyazv{sqytm}ev~es{lsu{rtunuksgvrteunoyznzxohrp~odgmfak|~rnopn~wnkjwbleugeuzcg}nzntbvazibwnwblrzlcoseif|znmvnvs|z|prbejg}ajdcuinuhimxtmuifnb|fwdgegxrequoespxmwqkc}ow~nd|nqyfhiyzbappg}jqs~srpd|rmyrva{wbrazxwjvzz}}atcaluwbtbcicg{frooaivnjqgwba|cxgftayc{xbd~bekdbskcynhzpeugkedybvzmcibhlfvcyswak|djiagkh}qsfpd{wdgqahrawtv}|gsmihz|iik{}itku}~}huwfulcafcvizvc{hc{mer~xaj}i~uouw~jfs~jbn~tmibn~c}{xqjzwbcoyvviy|vksrtzox|ebso{h|lbpugzriasry{{a~~crdpglioddxxe{mk}zmnhm}yb{byf{germeuw~m~ahki|~amphpzrenjytn{{{px{{fegz{kul~rwf|walerubgmvuih{ctdqajmllwr{vnfnqqc~un~vhvljx}efvdrvmufyv{aey{lcupzsj}zuvmgns~|mniuqg|h{r}bnjf{qyrpftwo}ygvzacnylkpqkw}xkzjshrvuqniqtw~lxbghsdfajk}dmemv|eut~iowbxduajbtnecxfty|dm}apqjfw|ap~yuivxeybvfq~f{x~kdb{olnaoprifwl~kn}u~br}ylenrfbrc~mhpqmgq}{wzgya{sp}~qpy{{dd}~m|jrwzca|dma}eansodxobnfdq~|w~r{tj|phxvrlconnfmgmjdnowsbweqxmmjpredn|t}hdnla}}dpeisdruoxihhjrlswldt|gihgrfmrja|nwtaw{oa|mn|vbcgo{k~xneyt|wbjn}ureeepeczc|zgwgtn~gchdg|ypqgxikyhwqbenibtkktfdfigcxj~xi{~q||l}miabraflc}anls}{brdwhzddchf}ll~gitukujxrsmcqgvn|bicvlngmomhhaeipqakpgvbyggcdo|rg}fuournnt||gobhebx|knsincsudd|f|ydzjshyxfyp|j|o~}zal}kr{rcxiuq|aniednsukxe}fbsnjc}jt|ndplnakp|dpcmf~sz{bvxl~wkitaniwpbvtlpasgc|trawpfbmnwcvpqx~d{vrkut|fot|wxgqtl}xmcfiidbbqrhqm}pzox|wlfpqgsb{nx|qponrednut|pzxttmtd~gse}hmkkwv{zusfrr}vuikjszbnex~exkup{ay~kdhwxja|{z{agghgkn|hasjfdfrtc|jubkudzg|uvclpsx}xgamthmpj{p}nujpit{q|s~cgzmqvh~qccsx{btrk}jfqov~lrclblmqeiwgrcxonlekfqsea}smbt{grvtfcmryhu~oyvqdfhx}{|lolabu~rxx}|baao}ev|zorgfx|vvmelczkjorx~m|y{fuy{{{yyxq~rxuqr||drrb}petwwkayurrxoychrxzfm~{y}}pokqwg{razayeb|ksblb|revlhife{phijnfmvzjczi}ncuthptxwuthpjikepih}fkrmvaqywmb~kps{xwimuh{cx|vipkfstmahs{hmintcz}zv}tdyk}jcraj~ebk|yplseif{skt{w~minj{l|rk|mfo}bfgwsqc~mjibql" );
		   
			System.out.println(testReverseString.zipString("qwertyuioplkjhgfdsAzxcvbNM"));
		   //System.out.println("a1b1c1d1".replace("1", ""));
		}
	
}
